import {Component, OnInit} from "@angular/core";
import { HttpClient } from '@angular/common/http';
import { HttpErrorResponse } from '@angular/common/http';
import { AppConfig } from '../../app-config';

@Component({
  selector: 'free-quotes',
  styleUrls: ['./freequotes.css'],
  templateUrl: './freequotes.component.html',
})


export class FreeQuotes {
  // title = 'JSON to Table Example';
  // arrBirds: string [];
  // public pathToSources:string=this.appConfig.baseApiPath+'request/lq'
  //
  // constructor (private httpService: HttpClient, private appConfig:AppConfig) { }
  //
  // ngOnInit () {
  //   this.httpService.get(this.pathToSources).subscribe(
  //     data => {
  //       this.arrBirds = data as string [];	 // FILL THE ARRAY WITH DATA.
  //       //  console.log(this.arrBirds[1]);
  //     },
  //     (err: HttpErrorResponse) => {
  //       console.log(err.message);
  //     }
  //   );
  // }implements OnInit
}
