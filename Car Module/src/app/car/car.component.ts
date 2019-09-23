import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {
  constructor() { }
carData:any=[];
    cars=[
      {brand:'BMW',img:'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg',description:'BMW team of engineers progressively developed their cars from small Seven-based cars into six-cylinder luxury cars and, in 1936, began production of the BMW 328 sports car. Aircraft engines, motorcycles, and automobiles would be BMW main products until World War II.'
      },
      {brand:'Lamborgini',img:'https://cdn.pixabay.com/photo/2017/03/20/04/57/truck-2158284__340.png',description:'Lamborghini gained wide acclaim in 1966 for the Miura sports coupé, which established rear mid-engine, rear wheel drive as the standard layout for high-performance cars of the era. Lamborghini grew rapidly during its first ten years, but sales plunged in the wake of the 1973 worldwide financial downturn and the oil crisis.'
    },
    {brand:'Farrari 558',img:'https://cdn.pixabay.com/photo/2017/11/09/01/49/ferrari-458-spider-2932191__340.jpg',description:'Ferrari supplied cars complete with V8 engines for the A1 Grand Prix series, from the 2008-09 season. The car was designed by Rory Byrne and is styled to resemble the 2004 Ferrari Formula one car. Ferrari currently runs a customer GT program for a racing version of its 458 and has done so for the 458s predecessors'
  },
  {brand:'Mercedes slk auto benz',img:'https://cdn.pixabay.com/photo/2018/10/20/14/14/mercedes-3760878__340.jpg',description:'2007 Mercedes-Benz 350 SLK. This car has beautiful lines and is built for speed. Everything is well engineered and designed. The nine speaker sound system delivers top-notch quality sound and the handling is what you would expect of a sports car of this quality. - , 2007 Mercedes-Benz SLK350'
  },
  {brand:'Ford capri',img:'https://cdn.pixabay.com/photo/2019/01/04/23/45/ford-capri-3914331__340.png',description:'Ford Capri Mk I was first launched in 1969 at the same time in Bonn and Brussels showrooms. The motto under which happened promotion model, were the words В«this is the car of your most outrageous fantasiesВ» (В«car of your wildest dream'
  },
  {brand:'Racing porche 9 11',img:'https://cdn.pixabay.com/photo/2017/02/04/19/30/racing-2038132__340.jpg',description:'The Porsche 911 GT2 RS . The Porsche 911 GT2 RS (Weissach package) with a monster 700HP and a 2.7-second zero-to-60-mph time is simply the rawest and purest form of motorsport performance ever put in a 911 chassis and Dream Racing is the only driving experience in Las Vegas where you can get behind the wheel of one.'
  },
  {brand:'Electric Sports car',img:'https://cdn.pixabay.com/photo/2016/08/31/15/50/electric-car-1633939__340.jpg',description:'Hybrid-electric sports cars began to appear in the 2010s— notably the 2013-2016 LaFerrari, 2013-2015 McLaren P1, 2013-2015 Porsche 918 Spyder "hypercars". The 2014-present BMW i8 was also an early plug-in hybrid sports car. McLaren began permanent car manufacturing operations with the 2011-2014 McLaren 12C.'
  },
  {brand:'T model mercedes Benz',img:'https://cdn.pixabay.com/photo/2018/03/25/10/37/t-model-3259027__340.png',description:'The sixth generation Mercedes-Benz E-Class T-Modell comes in a more modern shape, confidently stylish and dynamic, looking the same as the Salon model through the B-pillar.'
  },
  {brand:'Opel record',img:'https://cdn.pixabay.com/photo/2017/07/08/16/27/opel-record-2484859__340.png',description:'The Opel Rekord Series A is a executive car introduced in March 1963, by Opel as a replacement for the Opel Rekord P2.It was fractionally shorter but also wider than its predecessor with a wheelbase approximately 10 cm longer.'
  },
  {brand:'Flat model',img:'https://cdn.pixabay.com/photo/2015/10/28/18/35/fiat-1011114__340.jpg',description:'A flatcar (US) (also flat car (US) or flat wagon ) is a piece of railroad (US) or railway (non-US) rolling stock that consists of an open, flat deck mounted on a pair of trucks (US) or bogies (UK), one at each end containing four or six wheels.'
  },
    ];

sendDetails(car) {
this.carData = car;
}
ngOnInit() {
}
}
