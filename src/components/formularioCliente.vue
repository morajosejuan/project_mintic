<template>
    <div class="formCliente">
        <fieldset>
            <legend>Formulario Registro Cliente</legend>
            <form @submit.prevent="guardar">
                    <label for="idCliente">id cliente</label><br />
                    <input
                    type="number"
                    name="idCliente"
                    id="idCliente"
                    v-model="cliente.idCliente"
                    />
                    <br />

                    <label for="nombrecliente">nombre cliente</label><br />
                    <input
                    type="text"
                    name="nombrecliente"
                    id="nombrecliente"
                    v-model="cliente.nombreCliente"
                    />
                    <br />

                    <label for="telefonocliente">telefono cliente</label><br />
                    <input
                    type="number"
                    name="telefonocliente"
                    id="telefonocliente"
                    v-model="cliente.telefonoCliente"
                    />
                    <br />

                    <label for="direccioncliente">Direccion cliente</label><br />
                    <input
                    type="text"
                    name="direccioncliente"
                    id="direccioncliente"
                    v-model="cliente.direccionCliente"
                    />
                    <br />

                    <label for="documentocliente">Documento cliente</label><br />
                    <input
                    type="number"
                    name="documentocliente"
                    id="documentocliente"
                    v-model="cliente.documentoCliente"
                    />
                    <br />

                    <label for="emailcliente">Email cliente</label><br />
                    <input
                    type="email"
                    name="emailcliente"
                    id="emailcliente"
                    v-model="cliente.emailCliente"
                    />
                    <br />

                    <button type="submit">Guardar</button>
                    <button type="button" @click="eliminar(cliente.idCliente)">
                    Eliminar
                    </button>

            </form>



        </fieldset>


    </div>
</template>

<script>
import axios from "axios";
export default {
    name: "formularioCliente",
    data: function () {
    return {
      cliente: {
        idCliente: "",
        nombreCliente: "",
        telefonoCliente: "",
        direccionCliente: "",
        documentoCliente: "",
        emailCliente: "",
      },
    };
  },
  methods: {
    guardar() {
      axios
        .post("http://150.136.145.84:8080/papeleriaGrafiti/api/cliente", this.cliente)
        .then((data) => {
          console.log("response", data);
          this.$emit("refresh");
        });
    },

    listar() {
      axios
        .get("http://150.136.145.84:8080/papeleriaGrafiti/api/cliente/listar", this.cliente)
        .then((data) => {
          console.log("response", data);
          this.$emit("refresh");
        });
    },

    eliminar(id) {
      axios
        .delete("http://150.136.145.84:8080/papeleriaGrafiti/api/cliente/" + id)
        .then((data) => {
          console.log("response", data);
          this.cliente.idCliente = null;
          this.$emit("refresh");
        })
        .catch(() => {
          alert("El cliente seleccionado no existe");
        });

      console.log(id);
    },
  },
};
</script>

<style>
.formFCliente {

    text-align: center;
    font-size: small;
    padding: 2%;
}
</style>