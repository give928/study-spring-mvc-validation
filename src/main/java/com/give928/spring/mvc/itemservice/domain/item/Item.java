package com.give928.spring.mvc.itemservice.domain.item;

import lombok.Data;

@Data
//@ScriptAssert(lang = "javascript", script = "_this.price * _this.quantity >= 10000")
public class Item {
//    @NotNull(groups = EditCheck.class)
    private Long id;

//    @NotBlank(groups = {AddCheck.class, EditCheck.class})
    private String itemName;

//    @NotNull(groups = {AddCheck.class, EditCheck.class})
//    @Range(min = 1000, max = 1000000, groups = {AddCheck.class, EditCheck.class})
    private Integer price;

//    @NotNull(groups = {AddCheck.class, EditCheck.class})
//    @Max(value = 9999, groups = {AddCheck.class})
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
