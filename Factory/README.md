# Description

工廠模式比簡單工廠更要淺顯易懂些

以這個範例來說

今天要新建後端工程師、設備工程師、IOS工程師 數十種工程師等等

在簡單工廠必須在train 產生工程師物件的 function裡面實作switch 判別

透過多種type去產生engineer物件，

工廠模式 定義一個EngineerTrainingCamp interface

並且定一要訓練哪種工程師的類別並實作interface

public class FrontEndEngineerTrainingCamp implements EngineerTrainingCamp

public class SoftEngineerTrainingCamp implements EngineerTrainingCamp

這樣就可以透過不能的trainingCamp訓練出不同的工程師了。

