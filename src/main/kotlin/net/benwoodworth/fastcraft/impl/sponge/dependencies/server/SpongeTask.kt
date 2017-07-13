package net.benwoodworth.fastcraft.impl.sponge.dependencies.server

import net.benwoodworth.fastcraft.core.dependencies.server.Task
import net.benwoodworth.fastcraft.util.Adapter
import org.spongepowered.api.scheduler.Task as Sponge_Task

/**
 * Sponge implementation of [Task].
 */
class SpongeTask(
        task: Sponge_Task
) : Task, Adapter<Sponge_Task>(task) {

    override fun cancel() {
        base.cancel()
    }
}
