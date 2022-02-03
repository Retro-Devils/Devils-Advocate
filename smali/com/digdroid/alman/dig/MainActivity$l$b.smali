.class Lcom/digdroid/alman/dig/MainActivity$l$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity$l;->b(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/MainActivity$l;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity$l;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l$b;->b:Lcom/digdroid/alman/dig/MainActivity$l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$l$b;->b:Lcom/digdroid/alman/dig/MainActivity$l;

    iget-object p1, p1, Lcom/digdroid/alman/dig/MainActivity$l;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
