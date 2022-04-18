<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Validator;

use App\Models\Buku;

class BukuController extends Controller
{
    public function index()
    {
        $buku = Buku::all()->toArray();
        return $buku;
    }
    public function store(Request $request)
    {
        $validator = Validator::make($request->all(), [
            'judul' => 'required',
            'penulis' => 'required',
            'penerbit' => 'required',
            'tahun' => 'required'
        ]);

        if($validator->fails()) {
            return response()->json($validator->errors());
        }

        $buku = Buku::create([
            'judul' => $request->judul,
            'penulis' => $request->penulis,
            'penerbit' => $request->penerbit,
            'tahun' => $request->tahun
        ]);

        if($buku) {
            return response()->json(['status' => 1]);
        } else {
            return response()->json(['status' => 0]);
        }
    }
    public function show($id)
    {
        $buku = Buku::find($id);
        return $buku;
    }
    public function update($id, Request $request)
    {
        $validator = Validator::make($request->all(), [
            'judul' => 'required',
            'penulis' => 'required',
            'penerbit' => 'required',
            'tahun' => 'required'
        ]);

        $buku = Buku::find($id);

        $buku->update($request->all());

        if($buku) {
            return response()->json(['status' => 1]);
        } else {
            return response()->json(['status' => 0]);
        }

    }
    public function destroy($id)
    {
        $buku = Buku::find($id);

        $buku->delete();

        if($buku) {
            return response()->json(['status' => 1]);
        } else {
            return response()->json(['status' => 0]);
        }
    }
}
