import { ComponentFixture, TestBed } from '@angular/core/testing';

import { KambistaComponent } from './kambista.component';

describe('KambistaComponent', () => {
  let component: KambistaComponent;
  let fixture: ComponentFixture<KambistaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ KambistaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(KambistaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
