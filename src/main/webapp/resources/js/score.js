var body = document.querySelector('body');
var my_category = [];

body.onload = function(){
	var hidden_points = document.getElementsByClassName('invisible');
	var total=0;
	var count=0;
	for(let i=0;i<hidden_points.length;i++)
	{
		if(parseFloat(hidden_points.item(i).textContent)!=0)
			{
				count++;
			}
		total=parseFloat(total)+parseFloat(hidden_points.item(i).textContent);
		my_category.push(parseFloat(hidden_points.item(i).textContent));
	}
	total=parseFloat(total/count);
	my_category.push(total);
}
 var options={
		   chart: {
               height: 350,
               type: 'bar',
           },
           plotOptions: {
               bar: {
                   horizontal: false,
                   barWidth: 50,
               }
           },
           dataLabels: {
               enabled: true,
               offsetY: -20,
               style: {
                   fontSize: '12px',
                   colors: ["#304758"]
               }
           },
           series: [{
        	   name: '성적',
               data: my_category
           }],
           xaxis: {
               categories: ['1학년 1학기', '1학년 2학기', '2학년 1학기', '2학년 2학기', '3학년 1학기', '3학년 2학기', '4학년 1학기', '4학년 2학기 ','평균']
           }
 }
//var options = {
//  chart: {
//	  height:350
//    type: 'bar'
//  },
//  series: [{
//    name: 'sales',
//    data: [30, 40, 35, 50, 49, 60, 70, 91, 125]
//    	//data: my_category 
//  }],
//  xaxis: {
//   // categories: ["1학년1학기 ","1학년2학기","2학년1학기","2학년2학기","3학년1학기","3학년2학기","4학년1학기","4학년2학기"]
//  categories: [1111,2222,3333,4444,5555,6666,7777,8888]
//	  }
//}

var chart = new ApexCharts(document.querySelector("#chart"), options);

chart.render();