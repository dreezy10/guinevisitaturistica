$(function(){
	
	///active menu problem solved here
	
	switch(menu){
	case 'gastronomie':
		$('#culture').addClass('active');
		break;
		
	case 'ethnies':
		$('#culture').addClass('active');
		break;
		
	case 'reservation':
		$('#reservation').addClass('active');
		break;
		
		
	case 'contact':
		$('#contact').addClass('active');
		break;
		
		
		default:
			$('#a_'+menu).addClass('active');
		
		break;
	}
	
    

	
	
})

