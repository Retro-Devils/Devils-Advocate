.class Lcom/digdroid/alman/dig/MainActivity$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$e;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$e;->b:Lcom/digdroid/alman/dig/MainActivity;

    const-string p2, "retroarch"

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/z3;->D(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$e;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/MainActivity;->X2(Lcom/digdroid/alman/dig/MainActivity;)V

    return-void
.end method
