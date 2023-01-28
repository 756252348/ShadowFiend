package cn.dota.platform.application.ship.result;

import cn.dota.platform.domain.ship.Crew;

public record CrewInfoQueryResult(
        String name
) {
    public CrewInfoQueryResult(Crew crew) {
        this(crew.getName());
    }
}
