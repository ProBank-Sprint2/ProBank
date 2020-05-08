import { TestBed } from '@angular/core/testing';

import { DisbursementserviceService } from './disbursementservice.service';

describe('DisbursementserviceService', () => {
  let service: DisbursementserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DisbursementserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
