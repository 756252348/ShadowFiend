package cn.dota.platform.domain.ship.enums;

import cn.dota.platform.infrastructure.utility.persistent.AbstractEnumConverter;
import cn.dota.platform.infrastructure.utility.persistent.PersistableEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ShipStatus implements PersistableEnum<Integer> {
    UNDERWAY(0),
    ANCHORED(1),
    MISSING(20);

    private final Integer persistedValue;

    public static class Converter extends AbstractEnumConverter<ShipStatus, Integer> {
        public Converter() {
            super(ShipStatus.class);
        }
    }
}
