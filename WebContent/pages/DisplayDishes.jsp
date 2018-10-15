<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
.dishContainer {
	border-style: solid;
	border-width: 1px;
	max-width: 25%;
	padding: 5px;
}
</style>

<c:forEach var="item" items="${dishesList}">
	<div id="cont${item.dishId}" class="dishContainer">
		<p>
			<small><i style="float: right;">
			<span id="dishAvailability">
				<c:out value="${item.dishAvailability}" />
			</span>
			</i></small>
			<span id="dishId">
				<c:out value="${item.dishId}" />
			</span>
			<span id="dishCode">
				<c:out value="${item.dishCode}" />
			</span>
		</p>
		<p>
			<i><span id="dishName"><c:out value="${item.dishName}" /></span></i>
			--- <span id="dishPrice"><c:out value="${item.dishPrice}" /></span>
		</p>
		<p>
			<small><span id="dishDesc"><c:out
						value="${item.dishDesc}" /></span></small>
		</p>
		<img width="100%" height="100%" src="/OrderTaker/${item.dishPicture}"
			alt="${item.dishName}" />
	</div>
</c:forEach>

<script>
	if (calledFromManageDishes) {
		$('.dishContainer').click(function() {
			var dName = $(this).find('#dishName').html();
			var dPrice = $(this).find('#dishPrice').html();
			var dAvailability = $(this).find('#dishAvailability').html().trim();
			var dDesc = $(this).find('#dishDesc').html();
			
			$('#dishNameTxt').removeAttr("disabled");
			$('#dishNameTxt').val(dName);
			$('#dishPriceTxt').removeAttr("disabled");
			$('#dishPriceTxt').val(dPrice);
			$('#dishAvailabilityDropdown').removeAttr("disabled");
			$('#dishAvailabilityDropdown').val(dAvailability);
			$('#dishDescTxtArea').removeAttr("disabled");
			$('#dishDescTxtArea').val(dDesc);
		});
	}
</script>