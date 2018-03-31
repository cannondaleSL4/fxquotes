import {BigNumber} from 'bignumber.js';

export interface LiveQuotesInterfase {
  quote: string;
  base: string;
  price: BigNumber;
}
