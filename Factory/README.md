# Description

工廠模式比簡單工廠更要淺顯易懂些

以這個範例來說

今天要新建後端工程師、設備工程師、IOS工程師 數十種工程師等等

在簡單工廠必須在train 產生工程師物件的 function裡面實作switch 判別

透過多種type去產生engineer物件，

工廠模式 定義一個EngineerTrainingCamp interface

並且定一要訓練哪種工程師的類別並實作interface

<p><code>public class FrontEndEngineerTrainingCamp implements EngineerTrainingCamp</code></p>

<p><code>public class SoftEngineerTrainingCamp implements EngineerTrainingCamp</code></p>


這樣就可以透過不能的trainingCamp訓練出不同的工程師了。

結論

<ul>
<li>簡單工廠模式：工廠直接負責管理所有的產品，利用if else 或 switch case判斷式來產生產品。</li>
<li>工廠模式：工廠提升為一個概念，實際上產生產品的是實作工廠概念的實體工廠。</li>
</ul>




