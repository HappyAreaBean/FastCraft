package net.benwoodworth.fastcraftplus.core.inventory

/**
 * Provides inventories and items for the plugin.
 */
interface InventoryProvider<TItem : FcItem<*>> {

    /**
     * Create a new item.
     */
    fun createItem(type: String, amount: Int): TItem

    /**
     * Create a new grid inventory.
     *
     * @param height The height of the inventory.
     * @param title The title of the inventory.
     * @return A chest inventory with the specified height and title.
     */
    fun createGridInventory(height: Int, title: String?): FcChestInventory<TItem>
}