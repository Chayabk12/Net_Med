import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Pro3Component } from './pro3.component';

describe('Pro3Component', () => {
  let component: Pro3Component;
  let fixture: ComponentFixture<Pro3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Pro3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Pro3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
