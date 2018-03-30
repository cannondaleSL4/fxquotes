import { ApiRequestService } from './api-request.service';
import { HttpParams} from "@angular/common/http";

export class QuotesService{
  constructor (
    private apiRequest: ApiRequestService
  ){}

  getCurrentQuotes() {
    let me = this;
    let params: HttpParams = new HttpParams();
    this.apiRequest.get('request/lq')
  }
}
