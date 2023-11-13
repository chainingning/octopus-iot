package com.summer.iot.core.metadata.unit;

import cn.hutool.json.JSONUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DataTypeUnits {

	private static final List<DataTypeUnitSupplier> SUPPLIERS = new CopyOnWriteArrayList<>();

	static {
		DataTypeUnits.register(new DataTypeUnitSupplier() {
			@Override
			public Optional<DataTypeUnit> getById(String id) {
				return Optional.ofNullable(UnifyUnit.of(id));
			}

			@Override
			public List<DataTypeUnit> getAll() {
				return Arrays.asList(UnifyUnit.values());
			}
		});
	}

	public static void register(DataTypeUnitSupplier supplier) {
		SUPPLIERS.add(supplier);
	}

	public static Optional<DataTypeUnit> lookup(String id) {
		for (DataTypeUnitSupplier supplier : SUPPLIERS) {
			Optional<DataTypeUnit> unit = supplier.getById(id);
			if (unit.isPresent()) {
				return unit;
			}
		}
		if (JSONUtil.isJson(id)) {
			return Optional.ofNullable(JsonTypeUnit.of(id));
		}
		return Optional.of(SymbolTypeUnit.of(id));
	}

	public static List<DataTypeUnit> getAllUnit() {
		return SUPPLIERS.stream()
				.map(DataTypeUnitSupplier::getAll)
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
	}
}
