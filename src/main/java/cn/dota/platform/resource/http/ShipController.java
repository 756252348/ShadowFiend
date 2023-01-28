package cn.dota.platform.resource.http;

import cn.dota.platform.application.ship.ShipApplicationService;
import cn.dota.platform.application.ship.command.RegisterShipCommand;
import cn.dota.platform.application.ship.result.CrewInfoQueryResult;
import cn.dota.platform.application.ship.result.ShipInfoQueryResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "ShipController", description = "Ship 资源")
@AllArgsConstructor
@RestController
@RequestMapping("ship")
public class ShipController {
    private final ShipApplicationService shipApplicationService;

    @Operation(summary = "查询船舶信息")
    @ApiResponse
    @GetMapping("{shipId}")
    public ShipInfoQueryResult getShipInfo(@PathVariable("shipId") Integer shipId) {
        return shipApplicationService.getShipInfo(shipId);
    }

    @Operation(summary = "查询指定船舶船员信息")
    @ApiResponse
    @GetMapping("{shipId}/crew")
    public List<CrewInfoQueryResult> getAllCrewForShip(@PathVariable("shipId") Integer shipId) {
        return shipApplicationService.getAllCrewForShip(shipId);
    }

    @Operation(summary = "注册船舶信息")
    @ApiResponse
    @PatchMapping("")
    public ShipInfoQueryResult registerShip(@RequestBody @Valid RegisterShipCommand command) {
        return shipApplicationService.registerShip(command);
    }

    @Operation(summary = "注销船舶信息")
    @ApiResponse
    @DeleteMapping("{shipId}")
    public void unregisterShip(@PathVariable("shipId") Integer shipId) {
        shipApplicationService.unregisterShip(shipId);
    }
}