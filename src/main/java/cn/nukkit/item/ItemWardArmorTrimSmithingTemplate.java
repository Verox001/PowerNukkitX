package cn.nukkit.item;

import cn.nukkit.item.Item;

/**
 * @author Glorydark
 */
public class ItemWardArmorTrimSmithingTemplate extends Item {

    public ItemWardArmorTrimSmithingTemplate() {
        this(0, 1);
    }

    public ItemWardArmorTrimSmithingTemplate(Integer meta) {
        this(meta, 1);
    }

    public ItemWardArmorTrimSmithingTemplate(Integer meta, int count) {
        super(WARD_ARMOR_TRIM_SMITHING_TEMPLATE, meta, count, "Ward Armor Trim Smithing Template");
    }
}
