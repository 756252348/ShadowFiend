package cn.dota.platform.application.ship.result;

import cn.dota.platform.domain.ship.Ship;
import cn.dota.platform.domain.ship.enums.ShipStatus;
import cn.dota.platform.domain.ship.enums.ShipType;

import java.time.LocalDateTime;
import java.util.List;

public record ShipInfoQueryResult(
        Integer id,
        String name,
        ShipType type,
        LocalDateTime lastReportTime,
        String lastKnownLocation,
        ShipStatus status,
        String owner,
        List<CrewInfoQueryResult> crews
) {
    public ShipInfoQueryResult(Ship ship, List<CrewInfoQueryResult> crews) {
        this(ship.getId(), ship.getName(), ship.getType(), ship.getLastReportTime(), ship.getLastKnownLocation(), ship.getStatus(), ship.getOwner(), crews);
    }
}
