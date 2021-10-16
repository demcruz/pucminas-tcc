import React from "react";
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
            googleMapURL={`https://maps.googleapis.com/maps/api/js?libraries=geometry,drawing,places&key=AIzaSyCeajRVwvBKwxyQRRyMHOx4zVWzk1ETFuU`}
            loadingElement={<div style={{ height: `100%` }} />}
            containerElement={<div style={{ height: "80vh" }} />}
            mapElement={<div style={{ height: `50%` }} />}
            formattedOrigin={"Rua Riachuelo, 176"}
            formattedDestination={"Planalto Atibaia"}
          />
         </section>
      </main> 
    </div>
  );
};

export default Acompanhamento;
