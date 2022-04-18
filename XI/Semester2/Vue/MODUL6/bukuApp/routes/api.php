<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

use App\Http\Controllers\BukuController;

Route::middleware('api')->group(function() {
    Route::resource('buku', BukuController::class);
});
