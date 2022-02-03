.class final Lfr/bmartel/youtubetv/i/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/webkit/WebView;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:[Ljava/lang/Object;


# direct methods
.method constructor <init>(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/i/a$a;->b:Landroid/webkit/WebView;

    iput-object p2, p0, Lfr/bmartel/youtubetv/i/a$a;->c:Ljava/lang/String;

    iput-object p3, p0, Lfr/bmartel/youtubetv/i/a$a;->d:[Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/i/a$a;->b:Landroid/webkit/WebView;

    iget-object v1, p0, Lfr/bmartel/youtubetv/i/a$a;->c:Ljava/lang/String;

    iget-object v2, p0, Lfr/bmartel/youtubetv/i/a$a;->d:[Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lfr/bmartel/youtubetv/i/a;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
