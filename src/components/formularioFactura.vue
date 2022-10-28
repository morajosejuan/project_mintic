<template>
    <div class="formFactura">
        <fieldset>
            <legend>Formulario Factura</legend>
            <form action="">
                <label for="NoFactura">Numero Factura</label><br>
                <input type="text" name="NoFactura" id="NoFactura">

                <label for="Nomvendedor">Nombre Vendedor</label><br>
                <input type="text" name="Nomvendedor" id="Nomvendedor">

                <label for="Codigovendedor">Codigo Vendedor</label><br>
                <input type="text" name="Codigovendedor" id="Codigovendedor">


                <button>Crear</button> <button>Guardar</button> <button>Eliminar</button>

            </form>



        </fieldset>


    </div>
</template>

<script>
export default {
    name: "formularioFactura.vue"
}

</script>

<style>
.formFactura {

    text-align: center;
    font-size: small;
    padding: 2%;
}
</style>