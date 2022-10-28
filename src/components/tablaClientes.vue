<template>
    <div class="cliente">
        <fieldset>

            <legend>Tabla de Clientes</legend>
            <table>
        <tr>
          <th>id</th>
          <th>Nombre</th>
          <th>Telefono</th>
          <th>Direccion</th>
          <th>Documento</th>
          <th>Email</th>
        </tr>
        <tr v-for="cliente in clientes" :key="cliente.idCliente">
          <td>{{ cliente.idCliente }}</td>
          <td>{{ cliente.nombreCliente }}</td>
          <td>{{ cliente.telefonoCliente }}</td>
          <td>{{ cliente.direccionCliente }}</td>
          <td>{{ cliente.documentoCliente }}</td>
          <td>{{ cliente.emailCliente }}</td>
        </tr>
      </table>

        </fieldset>

    </div>

</template>

<script>
export default {
    name: "tablaClientes",
    
  props: {
    clientes: {
      type: Array,
    }
  },
  methods: {},
};
</script>

<style>
head {
    text-align: center;
    color: black;
    margin: 30px 30px;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 24px;
    font-weight: bolder;
}
/*nav,
section,
article,*/
footer {
    margin: 2em;
    padding: 1em;
    border: 1px;
    border-style: solid;
}

body {
    background-image: url(../../img/depositphotos_58059017.jpg);
    background-size: cover;
    background-repeat: no-repeat;
    background-position: center;
    background-attachment: fixed;
    font-style: inherit;
    font-size: medium;
    font-feature-settings: "abvm";
}

.text {
    text-align: center;
    color: blue;
    margin: 30px 30px;
    font-family: Arial, Helvetica, sans-serif;
    font-size: 18px;
    font-weight: bolder;
}

.factura {
    table-layout: fixed;
}

.fact-info>div>h5 {
    font-weight: bold;
}

.factura>thead {
    border-top: solid 3px #000;
    border-bottom: 3px solid #000;
}

.factura>thead>tr>th:nth-child(2),
.factura>tbod>tr>td:nth-child(2) {
    width: 300px;
}

.factura>thead>tr>th:nth-child(n+3) {
    text-align: right;
}

.factura>tbody>tr>td:nth-child(n+3) {
    text-align: right;
}

.factura>tfoot>tr>th,
.factura>tfoot>tr>th:nth-child(n+3) {
    font-size: 24px;
    text-align: right;
}

.cond {
    border-top: solid 2px #000;
}


input[type=text],
select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=email],
select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=date],
select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=number],
select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}


.tbCuidadores {
  padding: 5%;
  text-align: center;
}
table {
  border: 1px solid #000;
  margin: auto;
  padding: 1 px;
}
th {
  border: 1px solid #000;
}
tr,
td {
  width: 20%;
  text-align: left;
  vertical-align: top;
  border: 1px solid #000;
}
</style>