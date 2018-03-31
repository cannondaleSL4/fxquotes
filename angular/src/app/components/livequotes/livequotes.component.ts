import { Component, OnInit,TemplateRef, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import 'rxjs/add/operator/mergeMap';
import {LiveQuotesService} from "../../services/api/livequotes.service";


@Component({
	selector: 'live_quotes',
	templateUrl: './livequotes.component.html',
})

export class LiveQuotes implements OnInit {
  columns:any[];
  rows:any[];
  constructor(private router: Router, private liveQuotes: LiveQuotesService){}

  ngOnInit() {
    var me = this;
    me.getPageData();
  }

  getPageData() {
    var me = this;
    return me.liveQuotes.getLiveQuotes();
  }
}
