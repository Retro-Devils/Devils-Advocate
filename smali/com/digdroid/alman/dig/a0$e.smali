.class Lcom/digdroid/alman/dig/a0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a0;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/a0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0$e;->b:Lcom/digdroid/alman/dig/a0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$e;->b:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0;->g:Lcom/digdroid/alman/dig/a0$g;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/a0$g;->a()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$e;->b:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0;->h:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method
