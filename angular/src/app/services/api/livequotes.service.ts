import { ApiRequestService } from './api-request.service';
import {Observable, Subject} from "rxjs";
import {LiveQuotesInterfase} from "../livequotesinterface";
import {Injectable} from "@angular/core";

@Injectable()
export class LiveQuotesService{
  constructor (
    private apiRequest: ApiRequestService,
){}

  getLiveQuotes(): Observable<LiveQuotesInterfase[]> {
    return this.apiRequest.get('request/lq').map(data=>{
      let liveQuotesList = data["liveQuotesList"];
      return liveQuotesList.map(function(quotes:any) {
        return {quote: quotes.quote, base: quotes.base, price: quotes.price};
      });
    });
  }

}
