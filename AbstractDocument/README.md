# Description

## Abstract document

所有的屬性都是透過'Map<String, Object>'存放，不用擔心具體的物件型態

範例說明Human可以透過'Name','Age'設定Human的基本資訊

Human可以透過'Map<String, Object>'來存放子對象

如Cap、Clothes、Pants、Watch相關子對象。

通過繼承接口獲取該類型相關屬性，此範例的接口有HasType、HasBrand、HasPrice，

如果想取得Human手錶相關資訊可以human.getPart().HasType.getType取得手錶型態的子對象

human.getPart().HasBrand.getBrand取得其品牌資訊

human.getPart().HasPrice.getPrice取得其價錢資訊

通過基本接口的設計可以規劃其子物件的取得資訊。


