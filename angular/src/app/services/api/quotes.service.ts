import { Injectable, Inject } from '@angular/core';
import { Observable, ReplaySubject, Subject } from 'rxjs';
import { ApiRequestService } from './api-request.service';
import { HttpParams} from "@angular/common/http";

@Injectable
export class QuotesService{
  constructor (
    private apiRequest: ApiRequestService
  ){}

  getCurrentQuotes(): Observable<any>{
    let me = this;
    let params: HttpParams = new HttpParams();
    this.apiRequest.get('')
  }
}
