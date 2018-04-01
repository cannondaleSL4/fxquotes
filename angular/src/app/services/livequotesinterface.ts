import {BigNumber} from 'bignumber.js';

export interface LiveQuotesInterface {
  quote: string;
  base: string;
  price: BigNumber;
}
