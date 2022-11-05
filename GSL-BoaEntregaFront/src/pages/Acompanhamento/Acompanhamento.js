import React from "react";
import {googleMaps} from '../../config'

import { withScriptjs, withGoogleMap } from "react-google-maps";
import Map from "./Map";


const Acompanhamento = () => {
  const WrappedMap = withScriptjs(withGoogleMap(Map));
  console.log(WrappedMap)
  return (
    <div>
      ROTA ENTREGA - PEDIDO USUARIO : DIEGO
     <main className="home">
        <section className="map"> 
          <WrappedMap
            googleMapURL={googleMaps}
            loadingElement={<div style={{ height: `100%` }} />}
            containerElement={<div style={{ height: "80vh" }} />}
            mapElement={<div style={{ height: `50%` }} />}
            formattedOrigin={"Av Washington Luiz 4735"}
            formattedDestination={"R Atibaia"}
          />
         </section>
      </main> 
    </div>
  );
};

export default Acompanhamento;
