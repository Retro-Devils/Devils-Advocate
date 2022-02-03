.class Lcom/digdroid/alman/dig/d0$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->t(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$k;->c:Lcom/digdroid/alman/dig/d0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/d0$k;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$k;->c:Lcom/digdroid/alman/dig/d0;

    iget-object p2, p0, Lcom/digdroid/alman/dig/d0$k;->b:Landroid/app/Activity;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/d0;->I(Landroid/app/Activity;)V

    return-void
.end method
