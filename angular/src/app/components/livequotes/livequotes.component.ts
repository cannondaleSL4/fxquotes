import { Component, OnInit,TemplateRef, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import 'rxjs/add/operator/mergeMap';
import {LiveQuotesService} from "../../services/api/livequotes.service";
import {LiveQuotesInterface} from "../../services/livequotesinterface";


@Component({
	selector: 'live_quotes',
	templateUrl: './livequotes.component.html',
})

export class LiveQuotes implements OnInit {
  _postsArray: LiveQuotesInterface[];
  constructor(private router: Router, private liveQuotes: LiveQuotesService){}

  ngOnInit() {
    var me = this;
    me.getPageData();
  }

  getPageData(): void {
    var me = this;
    me.liveQuotes.getLiveQuotes().subscribe(
      resultArray => this._postsArray = resultArray,
      error => console.log("Error :: " + error)
    );
  }
}
