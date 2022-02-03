.class Lcom/jaredrummler/android/colorpicker/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/c;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/jaredrummler/android/colorpicker/c;


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/c;)V
    .locals 0

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$a;->b:Lcom/jaredrummler/android/colorpicker/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$a;->b:Lcom/jaredrummler/android/colorpicker/c;

    iget-object p2, p1, Lcom/jaredrummler/android/colorpicker/c;->c:Lcom/jaredrummler/android/colorpicker/d;

    iget v0, p1, Lcom/jaredrummler/android/colorpicker/c;->h:I

    iget p1, p1, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-interface {p2, v0, p1}, Lcom/jaredrummler/android/colorpicker/d;->w0(II)V

    return-void
.end method
