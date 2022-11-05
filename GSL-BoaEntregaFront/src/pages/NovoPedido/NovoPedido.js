import React from "react";
import {googleMaps} from '../../config'
import GooglePlacesAutocomplete from 'react-google-places-autocomplete';
const NovoPedido = () => {
  return (
    <div>
     <ul class="timeline">
        <li class="active">Retirada</li>
        <li>Tipo de Mercadoria</li>
        <li>Destino</li>
      </ul>
              
    
      <GooglePlacesAutocomplete apiKey={googleMaps} />

      <button>Salvar</button>
    
    </div>
  );
};

export default NovoPedido;
