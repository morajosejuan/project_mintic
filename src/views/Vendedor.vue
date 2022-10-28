<template>
    <div class="Vendedor">
        <h1>Bienvenido Vendedor</h1>
        <FormularioFactura />
        <Factura />

    </div>

</template>



<script>
import FormularioFactura from '@/components/formularioFactura.vue';
import Factura from '../components/factura.vue';


export default {
    name: "Vendedor-view",
    components: { FormularioFactura, Factura }
}
</script>



<style>

</style>