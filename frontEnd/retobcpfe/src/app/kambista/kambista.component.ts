import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-kambista',
  templateUrl: './kambista.component.html',
  styleUrls: ['./kambista.component.css']
})
export class KambistaComponent implements OnInit {

  monto:number = 0.0;
  monedaorigen:string = "";
  monedadestino:string = "";

  constructor() { }

  ngOnInit(): void {
  }

  realizarCambio(){

    console.log ("Hola")   
  }

}
