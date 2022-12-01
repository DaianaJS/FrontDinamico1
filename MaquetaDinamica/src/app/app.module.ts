import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercademiComponent } from './components/acercademi/acercademi.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { HardskillsComponent } from './components/hardskills/hardskills.component';
import { SoftskillsComponent } from './components/softskills/softskills.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { FooterComponent } from './components/footer/footer.component';
import { AccesosComponent } from './components/accesos/accesos.component';


@NgModule({
  declarations: [
    AppComponent,
    BannerComponent,
    AcercademiComponent,
    EducacionComponent,
    NavbarComponent,
    ExperienciaComponent,
    HardskillsComponent,
    SoftskillsComponent,
    ProyectosComponent,
    FooterComponent,
    AccesosComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
