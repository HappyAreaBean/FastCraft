package net.benwoodworth.fastcraft.platform.sponge

import dagger.Component
import net.benwoodworth.fastcraft.platform.api.FastCraftComponent
import javax.inject.Singleton

/**
 * Sponge implementation of [Component].
 */
@Singleton
@Component(
    modules = [
        SpongeFastCraftModule::class
    ]
)
interface SpongeFastCraftComponent : FastCraftComponent
