<%@page  isELIgnored="false"%>
<html>
<body>
${failure}
<form action="order" method="post">
<h1>Order Product</h1><br>
Name<input type="text" name="name" value="${productsDTO.name}"><br>
Type<select name="type" value="${productsDTO.type}">
<option>select</option>
<option>Electronic Items</option>
<option>Medical Items</option>
<option>Clothes</option>
<option>Daily Used Items</option>
</select><br>
Cost<input type="text" name="cost" value="${productsDTO.cost}"><br>
Manufacturer<select name="manufacturer" value="${productsDTO.manufacturer}">
             <option>select</option>
             <option>Toyota</option>
             <option>Apple</option>
             <option>Nike</option>
             <option>Zara</option>
       </select><br>
Manufacturer Date<input type="date" name="manufacturerDate" value="${productsDTO.manufacturerDate}"><br>
Warranty<input type="text" name="warranty" value="${productsDTO.warranty}"><br>
<input type="submit" value="Save">

</form>
</body>
</html>