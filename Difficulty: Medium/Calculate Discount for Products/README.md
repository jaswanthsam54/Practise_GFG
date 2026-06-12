<h2><a href="https://www.geeksforgeeks.org/problems/calculate-discount-for-products/1?page=3&category=python&sortBy=submissions">Calculate Discount for Products</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO" style="--text-color: var(--problem-text-color);"><h3>Problem Description:</h3>
<p>Write a solution to calculate the discount for each product. The discount of a product is 100% of its price if the <strong>product_id</strong> is an even number and the <strong>category</strong> of the product starts with the letter 'A'. Otherwise, the discount is 0.</p>
<p>The result table should be ordered by <strong>product_id</strong>.</p>
<p><strong>Pandas Schema:</strong></p>
<p><strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/problem_desc/Web/Other/blobid0_1746698783.png" width="339" height="195"></strong></p>
<ul>
<li>
<p><strong>product_id</strong>: The unique ID for each product (Primary key).</p>
</li>
<li>
<p><strong>category</strong>: The category of the product.</p>
</li>
<li>
<p><strong>price</strong>: The price of the product.</p>
</li>
</ul>
<h3>Task:</h3>
<p>Write a solution to calculate the <strong>discount</strong> for each product. If the <strong>product_id</strong> is an even number and the <strong>category</strong> of the product starts with 'A', the discount is equal to 100% of the price. Otherwise, the discount is 0.</p>
<p>Return the result table ordered by <strong>product_id</strong>.</p>
<h3>Example :</h3>
<p><strong>Input table:</strong></p>
<p><strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/problem_desc/Web/Other/blobid1_1746698798.png" width="420" height="273"></strong></p>
<p><strong>Output table:</strong></p>
<p><strong><img src="https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/894935/Web/Other/blobid0_1746706071.png" width="335" height="264"></strong></p>
<p><strong>Explanation</strong>:</p>
<p>The result is a <strong>DataFrame </strong>having <strong>product_id </strong>and <strong>discount</strong> .</p>
<ul>
<li>
<p><strong>Product 1</strong>: The product_id is odd, so no discount is applied.</p>
</li>
<li>
<p><strong>Product 2</strong>: The product_id is even, and the category starts with 'A' (Apple), so the discount is 100% of the price (800).</p>
</li>
<li>
<p><strong>Product 3</strong>: The product_id is odd, so no discount is applied.</p>
</li>
<li>
<p><strong>Product 4</strong>: The product_id is even, and the category starts with 'A' (Avocado), so the discount is 100% of the price (1000).</p>
</li>
<li>
<p><strong>Product 5</strong>: The product_id is odd, so no discount is applied.</p>
</li>
</ul>
<blockquote>
<pre><span style="font-size: 14pt;"><strong>Note:</strong> Please use the same variable names and format as shown in the output</span></pre>
</blockquote></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>python</code>&nbsp;