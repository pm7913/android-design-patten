# Description

#### Simple Factory


工廠模式其實就是在一個類別裡面建構出有相同父類別的物件

工廠會根據傳入參數決定生成什麼物件並返回

使用工廠的使用者不用理會到底是什麼物件

只需要知道他們都有共同的父類別

在這個範例中EngineerFactory負責訓練工程師

然而在工程師中又分為FrontEnd engineer and Soft engineer

這兩類工程師，他們共同點都是實作Engineer這個Interface

EngineerFactor會根據傳入的type而產生FrontEnd engineer or Soft engineer的物件

這就是一個簡單的工廠模式。

