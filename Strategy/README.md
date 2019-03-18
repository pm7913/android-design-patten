# Description

策略模式

從example中定義一個抽象畫類別Festival

再定義3個節日繼承Festival class分別是Lantern、DragonBoat以及TombSweeping

這三個類別都具有一個公共的接口activities（）

從外變來看他們3個類別可以互相替換，

在不影響客戶端的情況下 根據策略需求進行變化


只要繼承策略類別

也因為策略類別都實作同一個接口

他們之間都可以互相自由的切換

容易擴展

不過有缺點就是客戶端必須知道所有的策略。
