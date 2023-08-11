Aaliyah-Culph-2021-04-30,Aaliyah,Culph,2021-04-30,Vecare Health Holbrook,24784,2/438 Union Rd,Lavington,29/11/2021,10/2026,2,2811195059,0432512372,1,2641,1,1,,,,,,,,,,,,,
Aariah-Holst-2018-06-15,Aariah,Holst,2018-06-15,Vecare Health - Walla Walla,28200,157 Walla Cemetery Road,Walla Walla,03/05/2022,05/2026,2,3540840883,0448467712,1,2659,1,1,,,,,,,,,,,,,
Aaron James-Grace-1994-09-19,Aaron James,Grace,1994-09-19,Vecare Health Holbrook,24784,Unit 1 328 Eurraka Road,BALLARAT WEST,30/08/2018,,,3498194421,,1,3350,1,2,0,,,,,,,,,,,,
Aaron-Beardsworth-1983-11-28,Aaron,Beardsworth,1983-11-28,Vecare Health - Walla Walla,28200,19 Wenke Street,Walla Walla,13/11/2020,02/2026,1,3360853269,0497534149,1,2659,1,2,,2,3067043668,11/2024,,,,,,,,,
Aaron-Day-2000-03-27,Aaron,Day,2000-03-27,Vecare Health Holbrook,24784,6 Casuarine Pl,Wagga Wagga,24/04/2023,09/2026,1,2870129691,0448357885,1,2650,1,2,,,,,aaronday2000@gmail.com,Springvale,,,,,,,
Aaron-Heritage-2004-07-15,Aaron,Heritage,2004-07-15,Vecare Health Holbrook,24784,26 Wallace Street,Holbrook,03/09/2017,09/2026,3,2794905063,0411697742,1,2644,1,2,,1,280727847J,12/2021,,,Aaron,Jade,,,,,
Aaron-Lansdown-2002-11-05,Aaron,Lansdown,2002-11-05,Vecare Health - Walla Walla,28200,12 Wenke St,Walla Walla,17/08/2022,09/2023,7,2648096184,0447095765,1,2659,1,2,,1,280603716 v,05/2024,,,,,,,,,
Aaron-Lieschke-2010-05-24,Aaron,Lieschke,2010-05-24,Vecare Health - Walla Walla,28200,Glenalvan,Alma Park,21/02/2019,08/2022,5,2589833938,0428296147,1,2659,1,2,,,,,,RMB 122,,David,0260290129,,,,



BEGIN{
 FS = ","
 _curr = ""
 _prev = "A"
 _seq = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
 b = ""
 NL = "\n"
}

{
	_curr = substr($1,1,1)
	if( _curr == _prev){
		print
		b += _prev + NL
	}else{
		_next = substr(_seq, index(_seq, _prev)+1,1)
		if( _curr == _next){
			b += _prev + NL
			_prev = _curr
		}else{
			print "ErrorCase..."
			b = _prev + $0
		}
	}
	_prev = $0;
}