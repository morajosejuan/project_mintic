<template>
    <div class="Clientes">
        <h1>Bienvenido Cliente</h1>
       
       
    <formularioCliente @refresh="refrescar" />
    <tablaClientes :clientes="clientes" />

    </div>

</template>



<script>
import formularioCliente from '@/components/formularioCliente.vue';
import tablaClientes from '../components/tablaClientes.vue';
import axios from "axios";


export default {
    name: "Cliente-view",
    components: { 
        formularioCliente, 
        tablaClientes,
     },

data: () => ({
    clientes: [],
  }),
  mounted() {
    this.getClientes();
  },
  methods: {
    refrescar() {
      this.getClientes();
    },
    getClientes() {
      axios
        .get("http://150.136.145.84:8080/papeleriaGrafiti/api/cliente/listar")

        
    
        .then((response) => {
          this.clientes = response.data;
        });
    },
  },
};


</script>


<style scoped>
.cliente {
  text-align: center;
}
</style>


