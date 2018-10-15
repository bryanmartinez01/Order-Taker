var calledFromManageDishes = false;

function loadDishes(param) {
	$.ajax({
		url : contextPath + '/menu',
		method : 'GET',
		data : {
			action : 'createmenu',
			param : param
		},

		success : function(result) {
			$('#menuContainer').html(result);
		}
	});
}

function createMenuDropdownChange() {
	$.ajax({
		url : contextPath + '/menu',
		method : 'GET',
		data : {
			action : 'createmenu',
			param : $('#createMenuDropdown').val()
		},

		success : function(result) {
			$('#menuContainer').html(result);
		}
	});
}

function generateNewDishCode(){
	var name = $('#newDishNameTxt').val().trim();
	
	if(name.indexOf(" ") == -1 && name.length != 1){
		$('#newDishCodeLabel').html(name.charAt(0).toUpperCase() + name.charAt(name.length-1).toUpperCase());
	}
	else{
		var nameSplit = $('#newDishNameTxt').val().trim().split(" ");
		$('#newDishCodeLabel').html(nameSplit[0].charAt(0).toUpperCase() + nameSplit[nameSplit.length-1].charAt(0).toUpperCase());
	}
}