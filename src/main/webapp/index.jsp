<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>上传图片</title>
</head>
<body>
	<form action="uploadImage.do" method="post" enctype="multipart/form-data" 
	style="width:40%;margin: 0 auto;margin-top: 10%">
		<fieldset>
			<legend><span>please choose</span></legend>
			<input type="file" name="file" /> 
			<input type="submit" value="Submit" />
		</fieldset>
	</form>
</body>
</html>
