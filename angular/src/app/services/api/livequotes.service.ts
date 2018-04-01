import { ApiRequestService } from './api-request.service';
import {Observable, Subject} from "rxjs";
import {LiveQuotesInterface} from "../livequotesinterface";
import {Injectable} from "@angular/core";

@Injectable()
export class LiveQuotesService{
  constructor (
    private apiRequest: ApiRequestService,
){}

  getLiveQuotes(): Observable<LiveQuotesInterface[]> {
    return this.apiRequest.get('request/lq')
      .map(response => response.json() as LiveQuotesInterface[])
  }
}
